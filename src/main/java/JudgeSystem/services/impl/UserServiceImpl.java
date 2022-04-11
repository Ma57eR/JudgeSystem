package JudgeSystem.services.impl;

import JudgeSystem.models.entities.User;
import JudgeSystem.models.services.UserServiceModel;
import JudgeSystem.repositories.UserRepository;
import JudgeSystem.services.RoleService;
import JudgeSystem.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleService roleService;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, RoleService roleService, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.roleService = roleService;
        this.modelMapper = modelMapper;
    }


    @Override
    public UserServiceModel registerUser(UserServiceModel userServiceModel) {

        userServiceModel
                .setRole(this.roleService
                        .findByName(
                                this.userRepository.count() == 0
                                        ? "ADMIN"
                                        : " USER"));


        User user = this.modelMapper.map(userServiceModel, User.class);


        return this.modelMapper.map(this.userRepository.saveAndFlush(user),
                UserServiceModel.class);
    }
}
