/// <reference types="cypress" />

context('Logins válidos e inválidos', () => {
    beforeEach(() => {
        cy.visit('https://www.saucedemo.com/');
    });

    it('Login válido - Usuário padrão', () => {
        cy.get('[data-test="username"]').type('standard_user');
        cy.get('[data-test="password"]').type('secret_sauce');
        cy.get('[data-test="login-button"]').click();
        cy.get('[data-test="title"]').should('be.visible');
    });

    it('Login inválido - Usuário errado', () => {
        cy.get('[data-test="username"]').type('standard_errado');
        cy.get('[data-test="password"]').type('secret_sauce');
        cy.get('[data-test="login-button"]').click();
        cy.get('[data-test="error"]').should('have.text', 'Epic sadface: Username and password do not match any user in this service');
    });

    it('Login inválido - Senha errada', () => {
        cy.get('[data-test="username"]').type('standard_user');
        cy.get('[data-test="password"]').type('secret_erra');
        cy.get('[data-test="login-button"]').click();
        cy.get('[data-test="error"]').should('have.text', 'Epic sadface: Username and password do not match any user in this service');
    });

    it('Login inválido - Username em branco', () => {
        cy.get('[data-test="username"]').clear();
        cy.get('[data-test="password"]').type('secret_sauce');
        cy.get('[data-test="login-button"]').click();
        cy.get('[data-test="error"]').should('have.text', 'Epic sadface: Username is required');
    });

    it('Login inválido - Password em branco', () => {
        cy.get('[data-test="username"]').clear().type('standard_user');
        cy.get('[data-test="password"]').clear();
        cy.get('[data-test="login-button"]').click();
        cy.get('[data-test="error"]').should('have.text', 'Epic sadface: Password is required');

    });

});