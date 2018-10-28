package it.stacja.app.web.wykop.app.image;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("internal")
public class InternalImageResolver implements PageImageResolver {

  @Override
  public String resolveImageURL(String pageURL) {
    return "/images/cross.png";
  }
}
