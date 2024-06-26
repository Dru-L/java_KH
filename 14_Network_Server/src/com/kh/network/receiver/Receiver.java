package com.kh.network.receiver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Receiver implements Runnable {
	//Thread에서 사용할 필드 선언
	private Socket client;
	
	public Receiver(Socket client) {
		this.client = client;
	}

	@Override
	public void run () {
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			//5. 연결된 클라이언트와 입출력 스트림 생성
			// 6. 보조 스트림을 통해 성능 개선
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream(),true);
			
			// 7. 스트림을 통해 읽고 쓰기
			while(true) {
				//클라이언트부터 입력이 있을 때까지 대기한다.
				String message = br.readLine();//입력된 값을 읽어서 문자로 출력해줌.
				
				if(message == null || "exit".equals(message)) {
					System.out.println("클라이언트 접속 종료");
					break;
				}
				
				System.out.println("클라이언트가 보낸 메세지 : " + message);
				
				pw.println("메세지 받기 성공");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//8. 통신 종료
			try {
				pw.close();
				br.close();
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
