package lab2;

import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;

import java.util.Arrays;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;


public class AES
{
	String strDataToEncrypt = new String();
	String strCipherText = new String();
	String strDecryptedText = new String();
        Cipher aesCipher;
        SecretKeySpec secretKey;
        KeyGenerator keyGen;
        byte[] byteCipherText;

	public AES()
	{
		try{
		/**
		 *  Step 1. Generate an AES key using KeyGenerator
		 *  		Initialize the keysize to 128
		 *
		 */

                byte[] key = ("secretencryptionkey").getBytes("UTF-8");
                MessageDigest sha = MessageDigest.getInstance("SHA-1");
                key = sha.digest(key);
                key = Arrays.copyOf(key, 16); // use only first 128 bit

                SecretKeySpec secretKey = new SecretKeySpec(key, "AES");

		/**
		 *  Step2. Create a Cipher by specifying the following parameters
		 * 			a. Algorithm name - here it is AES
		 */

		aesCipher = Cipher.getInstance("AES");

		/**
		 *  Step 3. Initialize the Cipher for Encryption
		 */

		aesCipher.init(Cipher.ENCRYPT_MODE,secretKey);
		}
		catch (java.io.UnsupportedEncodingException encodeError)
		{
			System.out.println(" Unsupported Encoding " + encodeError);
		}
		catch (NoSuchAlgorithmException noSuchAlgo)
		{
			System.out.println(" No Such Algorithm exists " + noSuchAlgo);
		}
                catch (NoSuchPaddingException noSuchPad)
                {
                        System.out.println(" No Such Padding exists " + noSuchPad);
                }
                catch (InvalidKeyException invalidKey)
                {
                        System.out.println(" Invalid Key " + invalidKey);
                }

	}
	public String encrypt(String toEncrypt)
	{
            try{
                strDataToEncrypt = toEncrypt;
                byte[] byteDataToEncrypt = strDataToEncrypt.getBytes();
                byteCipherText = aesCipher.doFinal(byteDataToEncrypt);
                strCipherText = new BASE64Encoder().encode(byteCipherText);
            }
            catch (IllegalBlockSizeException illegalBlockSize)
            {
                    System.out.println(" Illegal Block Size " + illegalBlockSize);
            }
            catch (BadPaddingException badPadding)
            {
                    System.out.println(" Bad Padding " + badPadding);
            }
           return strCipherText;
	}
}