package com.example.hadoopdemo.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HdfsClient{
    @Test
    public void testMkdirs() throws IOException, InterruptedException, URISyntaxException {

        // 1 ��ȡ�ļ�ϵͳ
        Configuration configuration = new Configuration();

        FileSystem fs = FileSystem.get(new URI("hdfs://node1:9000"), configuration,"root");

        // 2 ����Ŀ¼
        fs.mkdirs(new Path("/java/test"));

        // 3 �ر���Դ
        fs.close();
    }
}

