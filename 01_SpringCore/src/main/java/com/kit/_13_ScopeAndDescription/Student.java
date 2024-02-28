package com.kit._13_ScopeAndDescription;

public class Student {
int usn;
String name;
public int getUsn() {
	return usn;
}
public void setUsn(int usn) {
	this.usn = usn;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [usn=" + usn + ", name=" + name + "]";
}

}
