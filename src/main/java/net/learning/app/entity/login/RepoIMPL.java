package net.learning.app.entity.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepoIMPL {



    public RepoIMPL(StudentRepo repo) {
        this.repo = repo;
    }
    @Autowired
    StudentRepo repo;

    public StuLogin save(StuLogin stuLogin){
        return repo.save(stuLogin);
    }





}
