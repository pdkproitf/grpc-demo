# Steps to run

1. run `bundle install`
2. generate protobuf code
- - ```grpc_tools_ruby_protoc -I ./protos --ruby_out=./lib --grpc_out=./lib ./protos/*.proto```
3. grant permission to run client.rb file
- - `chmod +x client.rb`
4. run client file
- - `./client`
