public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new RegisterInMemory();
        UserServices userServices = new UserServices(userRepository);

        User user1 = new User("Kenny", "KennyEstPasBeau");
        User user2 = new User("Mohamed", "MohamedEstPasBeau");

        userServices.register(user1);
        userServices.register(user2);

        System.out.println("Utilisateurs enregistrés : ");
        for (User user : ((RegisterInMemory) userRepository).getUsers().values()) {
            System.out.println("Nom : " + user.getName() + ", Mot de passe : " + user.getPassword());
        }
    }
}