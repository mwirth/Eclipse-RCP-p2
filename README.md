# Eclipse-RCP-p2

update an Eclipse RCP e4 application using p2

The application hat consists of three versions (v1.0.0, v1.0.1, v1.0.2). Each version in an own branch.

## Version Features

### 1.0.0
Two plugins org.wimi.rcp.app and org.wimi.rcp.extra.one. The second plugin shows a Label with text `Extra One in Version 1.0.0`

### 1.0.1
The same two plugins but the plugin `org.wimi.rcp.extra.one` showing a label with text `Extra One in Version 1.0.1`

### 1.0.3
Added a third blugin `org.wimi.rcp.extra.two` dhowing a label `Extra Two in Version 1.0.` on the bottom.


## How to use

Here are the steps how you can test p2 updates using a Mac but should also run on Linux and Windows.

1.  checkout branch v1.0.2
2.  build branch with `mvn clean verify`
3.  copy folder `org.wimi.rcp.product/target/repository` to somewhere on your local filesystem. In this example I use `/home/blanase/p2test`
4.  checkout branch v1.0.0
5.  build branch with `mvn clean verify`
6.  start application in `org.wimi.rcp.product/target/products/wimi RCP app/macosx/cocoa/x86_64/Eclipse.app`. You have to set the SystemProperty `UpdateHandlerRepo` to the path of your repository. For example you can do this in the eclipse.ini with the line `-DUpdateHandlerRepo=file://home/blanase/p2test/repository/`
7.  click the first eclipse icon in the toolbar. Your application should now update from version 1.0.0 to 1.0.2. After a restart check the new Label on the Tab "Extra One" and the new View on the bottom.

You can play around with the application version an the repository version.

## There are still two tasks open.

1.  updates without restart (and without the OSGi-Console)
2.  use file p2.inf instead a SystemProperty


