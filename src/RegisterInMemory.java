import java.util.HashMap;
import java.util.Map;

public class RegisterInMemory implements UserRepository {
    private final Map<String, User> users = new HashMap<>();

    @Override
    public void registerUser(User user) {
        users.put(user.getName(), user);
    }

    public Map<String, User> getUsers() {
        return users;
    }
}
