package uk.co.jordanrobinson.githubstreakreminders;

import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.client.GitHubRequest;
import org.eclipse.egit.github.core.service.RepositoryService;

public class GithubService {

    private RepositoryService service;
    private GitHubClient client;

    public GithubService() {
        client = new GitHubClient();
        service = new RepositoryService();
        client.setCredentials("", "");
    }

    public boolean doesUserExist(String username) {
//        client.get();
//        GitHubRequest request = new GitHubRequest();
//        request.
        return false;
    }

    public boolean committedToday() {
        return false;
    }

    public int getStreakLength() {
        return 0;
    }
}
