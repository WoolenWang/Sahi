package net.sf.sahi.report;

/**
 * @author dlewis
 */
public class TestSummary {
    private String scriptName = null;

    private String logFileName = null;

    private boolean addLink = false;

    private int steps;

    private int failures;

    private int errors;
    
    private boolean fail;

    public boolean addLink() {
        return addLink;
    }

    public void setAddLink(boolean addLink) {
        this.addLink = addLink;
    }

    public String getLogFileName() {
        return logFileName;
    }

    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    public int getErrors() {
        return errors;
    }

    public void setErrors(int errors) {
        this.errors = errors;
    }

    public int getFailures() {
        return failures;
    }

    public void setFailures(int failures) {
        this.failures = failures;
    }

    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void incrementFailures() {
        this.failures++;
    }

    public boolean hasFailed() {
        return fail;
    }

    public void incrementErrors() {
        this.errors++;
    }

    public void setFail(boolean fail) {
        this.fail = fail;
    }
}
