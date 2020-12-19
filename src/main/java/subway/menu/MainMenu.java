package subway.menu;

/**
 * 지하철 프로그램에서 메인 메뉴의 기능들을 관리하는 enum 클래스
 *
 * @author 483759@naver.com / 윤이진
 * @version 1.0 2020/12/13
 */
public enum MainMenu {
    ROUTE_INQUIRY('1'), QUIT('Q');

    final private char menu;

    MainMenu(char menu) {
        this.menu = menu;
    }

    public char getMenu() {
        return menu;
    }

    public boolean matchMenu(char menu) {return this.menu==menu;}
}