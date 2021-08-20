package aluczynska.category;


import aluczynska.budgetingprogram.utils.Strings;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class CategoryValidator implements Validator
{
	public boolean supports(Class clazz)
	{
		return Category.class.equals(clazz);
	}

	public void validate(Object obj, Errors errors)
	{
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", Strings.WARNING_EMPTY_CATEGORY_NAME);
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "color", Strings.WARNING_EMPTY_CATEGORY_COLOR);
	}
}