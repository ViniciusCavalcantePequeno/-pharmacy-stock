package Validators;

import Interfaces.UserInterface;
import exceptions.*;

public class PasswordValidator {
    public boolean passwordValidade(UserInterface user, String password) {
        if (user.getSenha().equals(password)) {
            return true;
        } else {
            throw new WrongPasswordException();
        }
    }
}
