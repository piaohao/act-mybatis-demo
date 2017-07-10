package demo.todo.mybatis;

import act.Act;
import act.util.DisableFastJsonCircularReferenceDetect;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.result.RenderJSON;

import javax.inject.Inject;

import static act.controller.Controller.Util.renderJson;

/**
 * A Simple Todo application controller
 */
@SuppressWarnings("unused")
@DisableFastJsonCircularReferenceDetect()
public class Todo {

    @Inject
    private AccountMapper mapper;

    @GetAction("/list")
    public RenderJSON list(String q) {
        return renderJson(mapper.selectAll());
    }

    public static void main(String[] args) throws Exception {
        Act.start("TODO-MyBatis");
    }


}
