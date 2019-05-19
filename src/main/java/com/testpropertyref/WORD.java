package com.testpropertyref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/5/19.
 */
public class WORD {
    private SPELL spell;

    public SPELL getSpell() {
        return spell;
    }

    public void setSpell(SPELL spell) {
        this.spell = spell;
    }
    public static void main(String [] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        WORD word=(WORD)   ac.getBean("word");
        SPELL spell=(SPELL)ac.getBean("spell");
        spell.spell();
        word.getSpell().spell();
    }
}
