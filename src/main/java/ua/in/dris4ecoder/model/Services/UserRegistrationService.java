package ua.in.dris4ecoder.model.Services;

import ua.in.dris4ecoder.model.businessObjects.CustomUser;
import ua.in.dris4ecoder.model.dao.Dao;

/**
 * Created by Alex Korneyko on 13.10.2016 12:16.
 */
public interface UserRegistrationService {

    boolean checkUserByLogin(String login);

    boolean checkPassword(String password);

    boolean registerUser(CustomUser user);

    void setDao(Dao dao);
}
