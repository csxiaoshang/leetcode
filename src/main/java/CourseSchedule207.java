package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-8 下午7:15
 * <p>
 * 类说明：
 */
public class CourseSchedule207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Course[] courses = new Course[numCourses];
        for (int i = 0; i < numCourses; i++) {
            courses[i] = new Course();
        }
        for (int i = 0; i < prerequisites.length; i++) {
            courses[prerequisites[i][0]].add(courses[prerequisites[i][1]]);
        }
        for (int i = 0; i < numCourses; i++) {
            if(isCyclic(courses[i])) return false;
        }
        return true;
    }

    private boolean isCyclic(Course cur) {
        if (cur.tested == true) return false;
        if (cur.visited == true) return true;
        cur.visited = true;
        for (Course c : cur.pre) {
            if (isCyclic(c)) {
                return true;
            }
        }
        cur.tested = true;
        return false;
    }

    class Course {
        boolean visited = false;
        boolean tested = false;
        List<Course> pre = new ArrayList<Course>();
        public void add(Course c) {
            pre.add(c);
        }
    }
}
