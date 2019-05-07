package com.antkorwin.heisenbug.contextmistakes.service;

/**
 * Created on 05.05.2019.
 *
 * @author Korovin Anatoliy
 */
public interface TemplateService {

    String build(String format, Object... variables);
}
