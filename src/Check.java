import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Check {

	private static final String LEGAL_CHARACTERS =
			"qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM123456789_";
	private static final int MAX_LENGTH = 20;
	public static void check (
		String login,
		String password,
		String confirmPassword
	)
	{
		checkLogin(login);
		checkPassword(password, confirmPassword);
	}



		private static void checkLogin(String login) {
			for (int i = 0; i < login.length(); i++) {
				if (LEGAL_CHARACTERS.indexOf(login.charAt(i)) == -1) {
					throw new WrongLoginException("Логин содержит недопустимые символы.");
				}
			}
			if (login.length() > MAX_LENGTH) {
				throw new WrongLoginException("Длина логина превышает максимум в " + MAX_LENGTH + " символов.");
			}
		}

		private static void checkPassword(String password, String confirmPassword) {
			for (int i = 0; i < password.length(); i++) {
				if (LEGAL_CHARACTERS.indexOf(password.charAt(i)) == -1) {
					throw new WrongPasswordException("Пароль содержит недопустимые символы.");
				}
			}
			if (password.length() > MAX_LENGTH) {
				throw new WrongPasswordException("Длина пароля превышает максимум в " + MAX_LENGTH + " символов.");
			}
			if (!password.equals(confirmPassword)) {
				throw new WrongPasswordException("Пароли не совпадают.");
			}
		}
}
