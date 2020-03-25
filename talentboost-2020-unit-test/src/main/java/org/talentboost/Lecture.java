package org.talentboost;

public class Lecture {

  protected static final String TO_STRING_PATTERN = "Lecture name=%1$s, course=%2$s";

  private String name;
  private Course course;

  public Lecture(String name, Course course) {
    this.name = name;
    this.course = course;
  }

  @Override
  public String toString() {
    return String.format(TO_STRING_PATTERN, name, course.getName());
  }
}
