package com.sm.dashboard.adapter.mongo;

import com.sm.dashboard.domain.LoadUsersUseCase;
import com.sm.dashboard.domain.model.User;

import java.util.List;

public class MongoUserRepository implements LoadUsersUseCase {


    @Override
    public List<User> get() {
        return List.of(User.builder()
                        .firstname("Varsha").lastname("Jadhav").email("Varsha.Jadhav@gmail.com")
                .build());
    }
}
