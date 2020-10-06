# 前期准备

虚拟机node1与外部windows都做好主机名映射node1，node1搭建好hdfs并启动

# hdfs包

HdfsClient有一个测试创建hdfs文件夹的方法

# mapReduce包

mapReduce的本地测试还需要在windows上搭一个hadoop环境。否则报错：

HADOOP_HOME and hadoop.home.dir are unset.

解压hadoop的二进制包，再加上hadoop.dll和winutils.exe及其附属。windows的hadoop其实没有参与干活儿。这是mapreduce本身的设置决定的，要有一个缓存路径，所以在windows上设置hadoop_home的目的就是为了给这个缓存用的。

这里笔者不在本地测试，直接打包放到虚拟机上运行：

```
hadoop jar hadoopdemo-0.0.1-SNAPSHOT.jar com.example.hadoopdemo.mapReduce.WordcountDriver /user/tzs/wc.input /user/tzs/output
```

了解过官方hdfs wordcount案例就知道：/user/tzs/wc.input是hdfs输入路径，/user/tzs/output是输出