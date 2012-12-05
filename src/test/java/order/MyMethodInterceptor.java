package order;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Vladislav.Rassokhin
 */
public class MyMethodInterceptor implements IMethodInterceptor {
    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
        System.out.println("================");
        System.out.println("MyMethodInterceptor.intercept called with methods:");
        for (IMethodInstance instance : methods) {
            System.out.println("    " + instance);
        }

        final ArrayList<IMethodInstance> list = new ArrayList<IMethodInstance>(methods);
        Collections.sort(list, new Comparator<IMethodInstance>() {
            @Override
            public int compare(IMethodInstance o1, IMethodInstance o2) {
                // Use inversed String.compareTo() order
                final int cnd = o1.getMethod().getRealClass().getCanonicalName().compareTo(o2.getMethod().getRealClass().getCanonicalName());
                if (cnd != 0) {
                    return -1 * cnd;
                } else {
                    return -1 * o1.getMethod().getMethodName().compareTo(o2.getMethod().getMethodName());
                }
            }
        });
        System.out.println("After reordering");
        for (IMethodInstance instance : list) {
            System.out.println("    " + instance);
        }
        System.out.println("================");
        System.out.flush();
        return list;
    }
}
