
import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {

	private List<Book> book = new ArrayList<>();

	private Scanner sc = new Scanner(System.in);

	public BookService() {

		book.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		book.add(new Book(2222, "문과남자의 과학공", "유시민", 15750, "돌베개"));
		book.add(new Book(3333, "역행자", "자청", 6480, "웅진지식하우스"));
		book.add(new Book(4444, "꿀벌의예언", "베르나르 베르베르", 6480, "열린책들"));
		book.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16290, "어크로스"));
	}

	public void displayMenu() {

		int menuNum = 0;
		do {

			try {
				System.out.println("\n===도서 목록 프로그램===");
				System.out.println("1. 도서 등록");
				System.out.println("2. 도서조회");
				System.out.println("3. 도서 수정");
				System.out.println("4. 도서 삭제");
				System.out.println("5. 즐겨찾기 추가");
				System.out.println("6. 즐겨찾기 삭제");
				System.out.println("7. 즐겨찾기 조회");
				System.out.println("8. 추천도서 뽑기");
				System.out.println("0. 프로그램 종료");

				System.out.println("메뉴를 입력하세요 : ");

				switch (menuNum) {
				case 1: // addBook break;
				case 2: // selectAll break;
				case 3: // updateBook break;
				case 4: // removeBook break;
				case 5: // likeBook break;
				case 6: // removeLikeBook break;
				case 7: // selectLikeBook break;
				case 8: // randomBook
				case 0:
					System.out.println("프로그램이 종료되었습니다.");
					break;
				default:
					System.out.println("메뉴에 작성된 번호만 입력하세요!");
					break;
				}

			} catch (Exception e) {
				System.out.println("\nerror : 입력형식이 유효하지 않습니다.");

				sc.nextLine();

				menuNum = -1;
			}

		} while (menuNum != 0);

	}

	public String BS1() {

		System.out.println("=======도서 등록=======");

		System.out.println("도서 번호 : ");
		int num = sc.nextInt();

		System.out.println("도서 제목: ");
		String name = sc.next();

		System.out.println("도서 저자 : ");
		String author = sc.next();

		System.out.println("도서 가격 : ");
		int price = sc.nextInt();

		System.out.println("도서 출판사 : ");
		String pubHouse = sc.next();

		if (book.add(new Book(num, name, author, price, pubHouse))) {
			return "성공";
		} else {

			return "실패";
		}

	}

}
