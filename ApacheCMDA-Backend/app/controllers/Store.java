package controllers;

import com.fasterxml.jackson.databind.JsonNode;

public interface Store {
    JsonNode getJson();
    Object build(JsonNode json);
    void save(Object o);
    Object response(Object o);
	Object store();
}
