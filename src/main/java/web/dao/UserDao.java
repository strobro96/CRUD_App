package web.dao;
import web.model.User;

import java.util.List;

public interface UserDao {

    //Метод для сохранения пользователя
    public void saveUser(User user);

    //Метод для получения пользователя по id
    public User getUserById (long id);

    //Метод для удаления пользователя
    public void deleteUser(long id);

    //Метод для получения списка пользователей
    public List<User> getAllUsers();

}
