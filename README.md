# MD5的使用

------

> * JavaSE 1.8
> * Eclipse Neon

MD5即Message-Digest Algorithm 5（信息-摘要算法5），用于确保信息传输完整一致。<br>
主要特点：<br>
	抗修改性、压缩性、不可逆性；<br>
MD家族：MD2、MD4、MD5，其中MD4安全性不好，已被破解。更倾向于使用MD5编码。<br>
一般，MD算法使用32个十六进制的符号表示；<br>

commons-codec-1.10.jar或bcprov-jdk15on-155.jar包下，有可将字节数组转换为十六进制或其他进制的工具类；<br>

在相应的demo中有MD的实现；<br>
使用JDK自带的类MessageDigest实现MD2或MD5；也可以使用commons-codec-1.10.jar包下的类DigestUtils实现MD2或MD5（实质上CC方式只是调用了JDK的实现）；使用bcprov-jdk15on-155.jar包下的MD4Digest实现MD4；<br>

目录结构：<br>
![](https://github.com/wyue2015/MD5/blob/master/1.png)
<br>
测试结果:<br>
8277e0910d750195b448797616e091ad  <br>
8277e0910d750195b448797616e091ad