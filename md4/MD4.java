package md4;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD4Digest;
import org.bouncycastle.util.encoders.Hex;


/**
 * 
 * @author wy
 * 使用bcprov-jdk15on-155.jar包下的MD4Digest实现MD4
 */
public class MD4 {
	public static String MD4Encode(String str){
		
		Digest digest = new MD4Digest();
		digest.update(str.getBytes(), 0, str.getBytes().length);
		byte[] bytes = new byte[digest.getDigestSize()];
		digest.doFinal(bytes, 0);
		return Hex.toHexString(bytes);
	}
	
	public static void main(String[] args) {
		System.out.println(MD4.MD4Encode("d"));
	}
	
}
