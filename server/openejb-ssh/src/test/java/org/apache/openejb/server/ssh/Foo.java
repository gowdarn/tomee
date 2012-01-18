package org.apache.openejb.server.ssh;

import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

@Singleton
@Lock(LockType.READ)
public class Foo {
    public String foo() {
        return "foo";
    }
}
