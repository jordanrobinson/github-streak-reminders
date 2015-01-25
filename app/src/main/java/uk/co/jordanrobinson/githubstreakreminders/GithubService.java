package uk.co.jordanrobinson.githubstreakreminders;

import org.eclipse.egit.github.core.User;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.UserService;

import java.io.IOException;

public class GithubService {

    private UserService service;
    private GitHubClient client;

    public GithubService() {
        client = new GitHubClient();
        service = new UserService();
    }

    public boolean doesUserExist(String username) {

        boolean ret;
        User user;

        try {
            user = service.getUser(username);
            ret = true;
        }
        catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
        System.out.println(user);

        return ret;
    }

    public boolean committedToday() {
        return false;
    }

    public int getStreakLength() {
        return 0;
    }
}
