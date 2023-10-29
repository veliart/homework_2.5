import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
	public static void main(String[] args) {

		String login = "User123";
		String password = "Qwerty1";
		String confirmPassword = "Qwerty";

		try {
			Check.check(login, password, confirmPassword);
			System.out.println("Валидация завершена");
		} catch (WrongLoginException  wrongLoginException) {
			wrongLoginException.printStackTrace();
		} catch (WrongPasswordException wrongPasswordException) {
			wrongPasswordException.printStackTrace();
		}

	}
}