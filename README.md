MapLog
======

A minecraft Plugin that logs whatever your players are doing with your map.

This plugin needs to do the following. 

- Logging block changes
- rollback changes
- undo rollback
- restore

Hopefully will get a multi-plugin that supports:
- Sponge (prefered)
- Granite
- MinecraftAPI
- uch rainbow uch uch

Compilation
=
The requirements to compile the plugin are:

- Mysql server
- Maven 3
 
1. Make a new database called `maplog`.
2. Change the password and username for your mysql server in the pom.xml
3. Execute `maven install`



Constributing
======
- Make sure you add some Unit tests to confirm that your code works.
