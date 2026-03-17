import java.util.Map;
import java.util.HashMap;

public class PreferenceService {

    public static PreferenceService instance = null;
    private Map<String, UserPreference> userPreferences;

    private PreferenceService(){
        this.userPreferences = new HashMap<>();
    }

    public static PreferenceService getInstance(){
        if(instance == null){
            instance = new PreferenceService();
        }
        return instance;
    }

    public void addUserPreference(UserPreference userPreference){
        userPreferences.put(userPreference.getUserId(), userPreference);
    }

    public Boolean isUserSubscribedToType(String userId, NotificationType type){
        UserPreference userPreference = userPreferences.get(userId);
        if(userPreference == null){
            return false;
        }
        return userPreference.isSubscribedType(type);
    }

    public Boolean isUserPreferredChannel(String userId, Channel channel){
        UserPreference userPreference = userPreferences.get(userId);
        if(userPreference == null){
            return false;
        }
        return userPreference.isPreferredChannel(channel);
    }

    

}
