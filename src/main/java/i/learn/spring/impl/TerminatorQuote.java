package i.learn.spring.impl;

import i.learn.spring.annotation.Inject;
import i.learn.spring.annotation.Profiling;
import i.learn.spring.annotation.PostProxy;
import i.learn.spring.interfaces.Quoter;

import javax.annotation.PostConstruct;

@Profiling
public class TerminatorQuote implements Quoter {

    @Inject(min = 2, max = 7)
    private int repeat;

    private String quote;

    public TerminatorQuote() {
        System.out.println("Constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct");
        System.out.println(repeat);
    }

    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("PostProxy");
        for (int i = 0; i < repeat; i++) {
            System.out.println(quote);
        }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
