
package com.kh.io.assiststream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C_DataStream {
	
	public void fileSaveAndRead() {
		try (
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("d_data.txt")); DataInputStream dis = new DataInputStream(new FileInputStream("d_data.txt"))
			) {//각각 스트림을 세미클론으로 구분
			dos.writeUTF("홍길동");	//문자열 넘겨줌.
			dos.writeInt(26);
			dos.writeDouble(173.3);
			dos.writeChar('M');
			dos.writeBoolean(false);
			
			//파일에서 값을 읽어오기(입력한 순서에 맞게 출력 -> 그렇지않으면 온전한 데이터를 가져올 수 없음)
//			DataInputStream dis = new DataInputStream(new FileInputStream("d_data.txt"));
			System.out.println("이름은 " + dis.readUTF());
			System.out.println("나이는 " + dis.readInt());
			System.out.println("키는 " + dis.readDouble());
			System.out.println("성별은 " + dis.readChar());
			System.out.println("결혼은 " + dis.readBoolean());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
