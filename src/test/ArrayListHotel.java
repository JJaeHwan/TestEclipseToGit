package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayListHotel {
	Map<Integer, Room> hotelMap;
	Scanner sc;
	
	public ArrayListHotel() {
		hotelMap = new HashMap<Integer, Room>();
		sc = new Scanner(System.in);
		
		//객실 초기화
		for(int i = 2; i <= 4; i++) {
			String type = null;
			switch(i) {
			case 2 : type = "싱글룸"; break;
			case 3 : type = "더블룸"; break;
			case 4 : type = "스위트룸"; break;
			}
			for(int j = 1; j <= 9; j ++) {
				int num = i * 100 + j;
				hotelMap.put(num, new Room(num, type));
			}
		}
	}

	public static void main(String[] args) {
		new ArrayListHotel().start();
	}

	private void start() {
		System.out.println("*****************************************");
		System.out.println("    호텔문을 열었습니다. 어서오십시요.");
		System.out.println("*****************************************");
		System.out.println();
		
		while(true) {
			int choice = displayMenu();
			switch (choice) {
			case 1:
				checkIn();
				break;
			case 2:
				checkOut();
				break;
			case 3:
				break;
			case 4:
				System.out.println("*****************************************");
				System.out.println("           #영업 종료요~~~#");
				System.out.println("*****************************************");
				return;
				
			default:
				System.out.println("잘못 입력 함 다시 입력 바람");
				break;
			}
		}
		
	}
	
	private void checkOut() {
		System.out.println("-----------------------------");
		System.out.println("   체크아웃 작업");
		System.out.println("-----------------------------");
		System.out.print("방번호 입력>>");
		int num = sc.nextInt();
		
	}

	private void checkIn() {
		System.out.println("---------------------------");
		System.out.println("체크인 작업");
		System.out.println("---------------------------");
		System.out.println("* 201 ~ 209 : 싱글룸");
		System.out.println("* 301 ~ 309 : 더블룸");
		System.out.println("* 401 ~ 409 : 스위트룸");
		System.out.println("---------------------------");
		System.out.print("방번호 입력 >>");
		int num = sc.nextInt();
		
		// 없는 방번호
		if( ! hotelMap.containsKey(num)) {
			System.out.println(num + "호 객실은 없습니다.");
			return;
		}
		
		// 객실에 손님이 있는지
		if(hotelMap.get(num).getGuestName() != null) {
			System.out.println(num + "호 객실에는 이미 손님이 있다!");
			return;
		}
		
		System.out.println("누구를 체크인 하시겠습니까?");
		System.out.println("이름 입력 >> ");
		String name = sc.next();
		
		//손님 이름을 해당 객실의 투숙객 이름이 저장될 변수에 저장
		hotelMap.get(num).setGuestName(name);
		System.out.println(name + "님 " + num + "호에 체크인 했습니다.");
	}

	private int displayMenu() {
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("어떤 업무를 하시겠습니까?");
		System.out.println("1. 체크인  2. 체크아웃  3. 객실상태  4. 업무종료");
		System.out.println("-------------------------------------");
		System.out.print("선택 >>");
		return  sc.nextInt();
		
	}
	

	class Room{
		private int roomNum;
		private String roomType;
		private String guestName;
		
		public Room(int roomNum, String roomType) {
			super();
			this.roomNum = roomNum;
			this.roomType = roomType;
		}

		public int getRoomNum() {
			return roomNum;
		}

		public void setRoomNum(int roomNum) {
			this.roomNum = roomNum;
		}

		public String getRoomType() {
			return roomType;
		}

		public void setRoomType(String roomType) {
			this.roomType = roomType;
		}

		public String getGuestName() {
			return guestName;
		}

		public void setGuestName(String guestName) {
			this.guestName = guestName;
		}

		@Override
		public String toString() {
			return "Room [roomNum=" + roomNum + ", roomType=" + roomType + ", guestName=" + guestName + "]";
		}
		
		
		
	}
}

