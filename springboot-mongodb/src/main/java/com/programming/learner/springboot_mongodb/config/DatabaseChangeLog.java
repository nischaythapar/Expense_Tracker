package com.programming.learner.springboot_mongodb.config;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.programming.learner.springboot_mongodb.model.Expense;
import com.programming.learner.springboot_mongodb.model.ExpenseCategory;
import com.programming.learner.springboot_mongodb.repository.ExpenseRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@ChangeLog
public class DatabaseChangeLog {

    @ChangeSet(order = "001", id = "seedDatabase", author = "Nischay")
    public void seedDatabase(ExpenseRepository expenseRepository) {
        List<Expense> expenseList = new ArrayList<>();

        expenseList.add(createExpense("Movie Night", ExpenseCategory.ENTERTAINMENT, BigDecimal.valueOf(15.50)));
        expenseList.add(createExpense("Weekly Groceries", ExpenseCategory.GROCERIES, BigDecimal.valueOf(120.75)));
        expenseList.add(createExpense("Dinner at Olive Garden", ExpenseCategory.RESTAURANT, BigDecimal.valueOf(45.20)));
        expenseList.add(createExpense("Electricity Bill", ExpenseCategory.UTILITIES, BigDecimal.valueOf(60.00)));
        expenseList.add(createExpense("Random Shopping", ExpenseCategory.MISC, BigDecimal.valueOf(25.00)));
        expenseList.add(createExpense("Concert Ticket", ExpenseCategory.ENTERTAINMENT, BigDecimal.valueOf(75.00)));
        expenseList.add(createExpense("Monthly Groceries", ExpenseCategory.GROCERIES, BigDecimal.valueOf(200.30)));
        expenseList.add(createExpense("Lunch at Cafe", ExpenseCategory.RESTAURANT, BigDecimal.valueOf(18.45)));
        expenseList.add(createExpense("Water Bill", ExpenseCategory.UTILITIES, BigDecimal.valueOf(30.00)));
        expenseList.add(createExpense("Gift for Friend", ExpenseCategory.MISC, BigDecimal.valueOf(40.00)));

    expenseRepository.insert(expenseList);
    }

    private Expense createExpense(String expenseName, ExpenseCategory expenseCategory, BigDecimal expenseAmount) {
        Expense expense = new Expense();
        expense.setExpenseCategory(expenseCategory);
        expense.setExpenseAmount(expenseAmount);
        expense.setExpenseName(expenseName);

        return expense;
    }
}
