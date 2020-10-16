package org.my.group.service.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;

import org.my.group.service.Service;

@Default
@ApplicationScoped
public class StringService implements Service<String> {

    @Override
    public String accept(String genericType) {
        return genericType;
    }

}
