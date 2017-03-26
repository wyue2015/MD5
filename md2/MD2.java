package md2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;


/**
 * 
 * @author wy
 * 使用JDK自带的类MessageDigest实现MD2；
 * 也可以使用commons-codec-1.10.jar包下的类DigestUtils实现MD2
 */
public class MD2 {
	public static String MD2Encode(String str){
		MessageDigest md2 = null;
		try {
			md2 = MessageDigest.getInstance("MD2");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		byte[] bytes = md2.digest(str.getBytes());
		
		//org.apache.commons.codec的jar包下，有可将字节数组转换为十六进制或其他进制的工具类
		return Hex.encodeHexString(bytes);
	}
	
	public static void main(String[] args) {
		System.out.println(MD2.MD2Encode("d"));
		
		//使用CC方式的工具类DigestUtils也可以实现md2
		System.out.println(DigestUtils.md2Hex("d"));
	}
	
}
