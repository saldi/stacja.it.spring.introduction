package it.stacja.app.web.wykop.app.image;

public class InternalImageResolver implements PageImageResolver {
    @Override
    public String resolveImageURL(String pageURL) {
        return "/images/cross.png";
    }
}
