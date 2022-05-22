package com.dh.code.solidPrinciples.dependencyinversion.service.Staff;

import com.dh.code.solidPrinciples.dependencyinversion.model.User;
import com.dh.code.solidPrinciples.dependencyinversion.model.Staff;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class StaffSearcherImpl implements StaffSearcherRepository {

    Staff tester = new Staff();

    private Map<Integer, User>  staffs = Collections.unmodifiableMap(new HashMap<Integer, User>(){
        {
            put(Staff.robEmployeeId,  Staff.rob());
            put(Staff.javiEmployeeId,  Staff.javi());
        }
    });

    @Override
    public Optional<User> search(Integer id) {
        if (id == null) {
            return Optional.empty();
        } else {
            return Optional.ofNullable(staffs.get(id));
        }
    }

}
