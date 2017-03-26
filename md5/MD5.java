package md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;


/**
 * 
 * @author wy
 * 使用JDK自带的类MessageDigest实现MD5；
 * 也可以使用commons-codec-1.10.jar包下的类DigestUtils实现MD5
 */
public class MD5 {
	public static String MD5Encode(String str){
		
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		byte[] bytes = md5.digest(str.getBytes());
		
		//org.apache.commons.codec的jar包下，有可将字节数组转换为十六进制或其他进制的工具类
		return Hex.encodeHexString(bytes);
	}
	
	public static void main(String[] args) {
		System.out.println(MD5.MD5Encode("d"));
		
		//使用CC方式的工具类DigestUtils也可以实现md5
		System.out.println(DigestUtils.md5Hex("d"));
	}
	
}
