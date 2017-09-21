
package org.wimi.rcp.extra.two;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class ExtraTwo
{

	@PostConstruct
	public void postConstruct(Composite parent)
	{
		new Label(parent, SWT.NONE).setText("Extra Two in Version 1.0.0");
	}

}
