package com.orange.gitworkflow;

public class GitWorkFlow {
    public static void main(String[] args) {
        String step1 = "Perform git stash - to store the uncommitted changes";
        String step2 = "Perform git checkout master - to to move to the local master branch";
        String step3 = "Perform git fetch command - to fetch the origin branches";
        String step3a = "Perform git pull command - to fetch and download content from the origin/master and" +
                "immediately update the local master to match that content.";
        String step4 = "Perform git checkout -b new_branch_name command - to create and move instantly to a new branch," +
        "that is identical to local master branch.";
        String step5 = "Add your changes to the related task";
        String step6 = "Review the changes and check out your code before committing it";
        String step7 = "Execute git commit be using Intellij's interface, where you can select which changes to be committed";
        String step8 = "Once all the changes are committed, execute a git push command by using CTRL+ALT+K";
        String step9 = "The committed changes are pushed to the origin branch with the same name, navigate to Github branch";
        String step10 = "Create a Pull Request from origin/new_branch_name into origin/master";
        String step11 = "Add the Pull Request details: name, description and request review from your colleagues";
        String step12 = "After 2 approvals from your colleagues, merge the branch";
        String step13 = "As a result the origin/master contains the last changes and the origin/new_branch_name can be deleted";
        String step14 = "Please keep in mind that locally you're still on the new_branch_name, It's good to move back to master";
        String step15 = "However the local master branch doesn't have the latest changes, therefore perform a git fetch and git pull";
        String step16 = "Request an additional change, after apply commit amend action";

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step3a);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);
        System.out.println(step16);

    }
}
