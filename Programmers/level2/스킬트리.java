package programmers;

import java.util.LinkedList;

// 미완성
public class 스킬트리 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int index = 0;
        LinkedList<Character> skillList = new LinkedList<>();
        for (int i = 0; i < skill.length(); i++) {
            skillList.add(skill.charAt(i));
        }
        answer = skill_trees.length;

        for (int j = 0; j < skill_trees.length; j++) {
            LinkedList<Character> skill_treesList = new LinkedList<>();

            for (int k = 0; k < skill_trees[j].length(); k++) {
                skill_treesList.add(skill_trees[j].charAt(k));
            }
            for (int k = 0; k < skill_treesList.size(); k++) {
                if (skillList.contains(skill_treesList.get(k)) && skill_treesList.get(k) == skillList.get(index)) {
                    index++;
                } else if (skillList.contains(skill_treesList.get(k)) && skill_treesList.get(k) != skillList.get(index)) {
                    answer--;
                    break;
                }
            }
            index = 0;
        }

        return answer;
    }
}
