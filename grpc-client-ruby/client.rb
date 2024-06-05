#!/usr/bin/env ruby

this_dir = File.expand_path(File.dirname(__FILE__))
lib_dir = File.join(this_dir, 'lib')
$LOAD_PATH.unshift(lib_dir) unless $LOAD_PATH.include?(lib_dir)

require 'grpc'
require 'greeting_services_pb'

def get_input_from_console
  print "What's your name? -> "
  gets.chomp
end

def send_message(server_stub)
  puts '************** [send_message] ********************'
  while true
    name = get_input_from_console
    break if name.empty?

    puts "[send_message] Send Request: #{name}"
    response = server_stub.say_hello(Greet::GreetRequest.new(name: name))
    puts "[send_message] Receive Reponse: #{response.message}"
  end
rescue GRPC::BadStatus => e
  abort "ERROR: #{e.message}"
end

def send_once_and_receive_many_times(server_stub)
  puts '************** [send_once_and_receive_many_times] ********************'
  name = get_input_from_console
  puts "[send_once_and_receive_many_times] Send Request: #{name}"
  server_stub.say_hello_many_times(Greet::GreetRequest.new(name: name)).each do |response|
    puts "[send_once_and_receive_many_times] Receive Response: #{response.message}"
  end
rescue GRPC::BadStatus => e
  abort "ERROR: #{e.message}"
end

def send_many_times_and_receive_once(server_stub)
  puts '************** [send_many_times_and_receive_once] ********************'
  names = ["Sasuke Uchiha", "Uchiha Itachi", "Hinata Hyuga", "Uchiha Shisui", "Sakura Haruno"]
  messages = Enumerator.new do |y|
    names.each do |name|
      y << Greet::GreetRequest.new(name: name)
      puts "[send_many_times_and_receive_once] Send Request: #{name}"
      sleep 1
    end
  end

  response = server_stub.say_hello_all_at_once(messages).message
  puts "[send_many_times_and_receive_once] Receive Response: #{response}"
rescue GRPC::BadStatus => e
  abort "ERROR: #{e.message}"
end

def send_many_times_and_receive_many_times(server_stub)
  puts '************** [send_many_times_and_receive_many_times] ********************'
  names = ["Pain", "Konan", "Obito Uchiha", "Madara Uchiha", "Kaguya Otsutsuki"]
  messages = Enumerator.new do |y|
    names.each do |name|
      y << Greet::GreetRequest.new(name: name)
      puts "[send_many_times_and_receive_many_times] Send Request: #{name}"
      sleep 1
    end
  end

  server_stub.say_hello_one_by_one(messages).each do |response|
    puts "[send_many_times_and_receive_many_times] Receive Response: #{response.message}"
  end
rescue GRPC::BadStatus => e
  abort "ERROR: #{e.message}"
end

def main
  server_stub = Greet::GreetService::Stub.new('localhost:9090', :this_channel_is_insecure)
  send_message(server_stub)
  send_once_and_receive_many_times(server_stub)
  send_many_times_and_receive_once(server_stub)
  send_many_times_and_receive_many_times(server_stub)
end

main
