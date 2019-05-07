package com.antkorwin.heisenbug.contextmistakes.service;

import org.springframework.stereotype.Service;

/**
 * Created on 05.05.2019.
 *
 * @author Korovin Anatoliy
 */
@Service
public class TemplateServiceImpl implements TemplateService {

    @Override
    public String build(String format, Object... variables) {
        return String.format(format, variables);
    }
}
