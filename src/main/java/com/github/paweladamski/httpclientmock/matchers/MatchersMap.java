package com.github.paweladamski.httpclientmock.matchers;

import java.util.HashMap;
import org.hamcrest.Matcher;

public class MatchersMap<K, V> extends HashMap<K, MatchersList<V>> {

  public boolean matches(K name, V value) {
    return this.containsKey(name) && this.get(name).allMatches(value);
  }

  public void put(K name, Matcher<V> value) {
    this.putIfAbsent(name, new MatchersList<>());
    this.get(name).add(value);
  }

  public String describe(String name) {
    return getOrDefault(name, new MatchersList<>()).describe();
  }
}
