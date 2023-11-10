package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User name = null;
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                name = user;
                break;
            }
        }
        if (name == null) {
            throw new UserNotFoundException("Пользователь не найден");
        }
        return name;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Пользователь не валидный.");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        } catch (Exception en) {
            en.printStackTrace();
        } catch (Throwable ent) {
            ent.printStackTrace();
        }
    }
}
