package md2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;


/**
 * 
 * @author wy
 * ʹ��JDK�Դ�����MessageDigestʵ��MD2��
 * Ҳ����ʹ��commons-codec-1.10.jar���µ���DigestUtilsʵ��MD2
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
		
		//org.apache.commons.codec��jar���£��пɽ��ֽ�����ת��Ϊʮ�����ƻ��������ƵĹ�����
		return Hex.encodeHexString(bytes);
	}
	
	public static void main(String[] args) {
		System.out.println(MD2.MD2Encode("d"));
		
		//ʹ��CC��ʽ�Ĺ�����DigestUtilsҲ����ʵ��md2
		System.out.println(DigestUtils.md2Hex("d"));
	}
	
}
