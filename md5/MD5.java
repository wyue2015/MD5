package md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;


/**
 * 
 * @author wy
 * ʹ��JDK�Դ�����MessageDigestʵ��MD5��
 * Ҳ����ʹ��commons-codec-1.10.jar���µ���DigestUtilsʵ��MD5
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
		
		//org.apache.commons.codec��jar���£��пɽ��ֽ�����ת��Ϊʮ�����ƻ��������ƵĹ�����
		return Hex.encodeHexString(bytes);
	}
	
	public static void main(String[] args) {
		System.out.println(MD5.MD5Encode("d"));
		
		//ʹ��CC��ʽ�Ĺ�����DigestUtilsҲ����ʵ��md5
		System.out.println(DigestUtils.md5Hex("d"));
	}
	
}
