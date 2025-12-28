package com.programming.learner.springboot_mongodb.service;

import com.programming.learner.springboot_mongodb.model.Expense;
import com.programming.learner.springboot_mongodb.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public void addExpense(Expense expense){
        expenseRepository.insert(expense);
    };

    public void updateExpense(Expense expense){
        Expense existingExpense = expenseRepository.findById(expense.getId())
                .orElseThrow(() -> new RuntimeException(  // Fixed: () ->
                        String.format("Cannot find expense with ID %s", expense.getId())));

        existingExpense.setExpenseAmount(expense.getExpenseAmount());
        existingExpense.setExpenseCategory(expense.getExpenseCategory());
        existingExpense.setExpenseName(expense.getExpenseName());

        expenseRepository.save(expense);
    };

    public List<Expense> getAllExpenses(){
       return expenseRepository.findAll();
    };
    public Expense getExpenseByName(String name){
        return expenseRepository.findByName(name).orElseThrow(() -> new RuntimeException(
                String.format("Cannot Find Expense by Name %s", name)));
    };
    public void deleteExpense(String id){
        expenseRepository.deleteById(id);
    };
}
